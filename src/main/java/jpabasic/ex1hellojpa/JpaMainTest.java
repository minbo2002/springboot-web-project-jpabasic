package jpabasic.ex1hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMainTest {

    public static void main(String[] args) {

        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        */

//        try {
//
//            /* todo "생성"
//
//            // 비영속 상상태
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("Test1");
//
//            // 영속 상태
//            em.persist(member);
//
//            tx.commit();
//            */
//
//            /* todo "조회"
//            Member findMember = em.find(Member.class, 1L);
//            */
//
//            /* todo "변경"
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("Test2");
//            // 영속성 컨텍스트에 있는것들은 JPA가 관리를 하는데
//            // transaction commit 하기 직전에 변경되었는지 체크한다. 만약 변경되었다면 update 쿼리 날린다음 commit
//
//            tx.commit();
//            */
//
//            /* todo "삭제"
//            Member findMember = em.find(Member.class, 1L);
//
//            em.remove(findMember);
//
//            tx.commit();
//            */
//
//            /* todo JPQL
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(8)
//                    .getResultList();
//
//            // JPA 입장에서는 테이블 대상으로 쿼리를 만들지않고 Entity 객체를 대상으로 쿼리를 만든다.
//
//            for(Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }
//            */
//
//            /* todo 엔티티 등록 (쓰기지연SQL 저장소)
//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//
//            em.persist(member1);
//            em.persist(member2);
//
//            System.out.println("=============================");
//
//            tx.commit();
//            */
//
//            /* todo flush 테스트
//            Member member = new Member(200L, "member200");
//
//            em.persist(member);
//            em.flush();
//
//            System.out.println("===============================");
//
//            tx.commit();
//            */
//
//            /* todo 준영속 상태 테스트
//            // 영속 상태
//            Member member = em.find(Member.class, 100L);
//            member.setName("aaaaaaaaaaa");
//
//            em.clear();
//
//            Member member2 = em.find(Member.class, 100L);
//
//            System.out.println("===============================");
//
//            tx.commit();
//            */
//
//
//            tx.commit();
//
//        } catch (Exception e) {
//
//            tx.rollback();
//
//        } finally {
//
//            em.close();
//        }
//        emf.close();
    }
}


