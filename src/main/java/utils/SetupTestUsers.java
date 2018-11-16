package utils;

import entity.Role;
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class SetupTestUsers {

  public static void main(String[] args) {

    EntityManager em = Persistence.createEntityManagerFactory("pu").createEntityManager();
    
    // IMPORTAAAAAAAAAANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // This breaks one of the MOST fundamental security rules in that it ships with default users and passwords
    // CHANGE the three passwords below, before you uncomment and execute the code below
    
   // throw new UnsupportedOperationException("REMOVE THIS LINE, WHEN YOU HAVE READ WARNING");
    
       
    em.getTransaction().begin();
    Role userRole = new Role("user");
    Role adminRole = new Role("admin");
    
    User testuser = new User("testuser", "1234");
    testuser.addRole(userRole);
    
    User user = new User("user", "1234");
    user.addRole(userRole);
    User admin = new User("admin", "admin");
    admin.addRole(adminRole);
    User both = new User("user_admin", "test");
    both.addRole(userRole);
    both.addRole(adminRole);
    
    em.persist(testuser);
    //em.persist(userRole);
    //em.persist(adminRole);
    //em.persist(user);
    //em.persist(admin);
    //em.persist(both);
    em.getTransaction().commit();
    System.out.println("PW: " + user.getUserPass());
    System.out.println("Testing user with OK password: " + user.verifyPassword("test"));
    System.out.println("Testing user with wrong password: " + user.verifyPassword("test1"));
    System.out.println("Created TEST Users");
   
  }

}
