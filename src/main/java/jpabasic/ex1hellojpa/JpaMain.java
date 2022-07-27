package jpabasic.ex1hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            /* todo "생성"

            // 비영속 상상태
           Member member = new Member();
            member.setId(1L);
            member.setName("Test1");

            // 영속 상태
            em.persist(member);

            tx.commit();
            */

            /* todo "조회"
            Member findMember = em.find(Member.class, 1L);
            */

            /* todo "변경"
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("Test2");
            // 영속성 컨텍스트에 있는것들은 JPA가 관리를 하는데
            // transaction commit 하기 직전에 변경되었는지 체크한다. 만약 변경되었다면 update 쿼리 날린다음 commit

            tx.commit();
            */

            /* todo "삭제"
            Member findMember = em.find(Member.class, 1L);

            em.remove(findMember);

            tx.commit();
            */

            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                    .setFirstResult(0)
                    .setMaxResults(8)
                    .getResultList();

            // JPA 입장에서는 테이블 대상으로 쿼리를 만들지않고 Entity 객체를 대상으로 쿼리를 만든다.

            for(Member member : result) {
                System.out.println("member.name = " + member.getName());
            }

        } catch (Exception e) {

            tx.rollback();

        } finally {

            em.close();
        }
        emf.close();
    }
}


