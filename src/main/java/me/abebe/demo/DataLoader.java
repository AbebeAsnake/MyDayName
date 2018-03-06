package me.abebe.demo;

import me.abebe.demo.AppRole;
import me.abebe.demo.AppUser;

import me.abebe.demo.AppRoleRepository;
import me.abebe.demo.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    AppUserRepository userRepository;
    @Autowired
    AppRoleRepository roleRepository;
    @Autowired
    DayNamesRepository dayNamesRepository;


    @Override
    public void run(String... args) throws Exception {
//load user and role
        AppRole role = new AppRole();
        role.setRoleName("USER");
        roleRepository.save(role);

            role = new AppRole();
            role.setRoleName("ADMIN");
            roleRepository.save(role);

        AppUser user = new AppUser();
        user.setFirstName("user");
        user.setLastName("lastName");
        user.setPassword("pass");
        user.setUsername("user");
        user.addRole(roleRepository.findAppRoleByRoleName("USER"));
        userRepository.save(user);

        AppUser admin = new AppUser();
        admin.setFirstName("admin");
        admin.setLastName("admin");

        admin.setPassword("pass");
        admin.setUsername("admin");
        admin.addRole(roleRepository.findAppRoleByRoleName("ADMIN"));
        userRepository.save(admin);

        //load
        DayNames dayNames1 = new DayNames();
        dayNames1.setDays("Monday");
        dayNames1.setFemaleName("Adjoa");
        dayNames1.setMaleName("Kojo");
        dayNames1.setUsers(user);
        dayNamesRepository.save(dayNames1);

        DayNames dayNames2 = new DayNames();
        dayNames2.setDays("Tuesday");
        dayNames2.setFemaleName("Abena");
        dayNames2.setMaleName("Kwabena");
        dayNames2.setUsers(user);
        dayNamesRepository.save(dayNames2);

        DayNames dayNames3 = new DayNames();
        dayNames3.setDays("Wednesday");
        dayNames3.setFemaleName("Akua");
        dayNames3.setMaleName("Kweku");
        dayNames3.setUsers(user);
        dayNamesRepository.save(dayNames3);

        DayNames dayNames4 = new DayNames();
        dayNames4.setDays("Thursday");
        dayNames4.setFemaleName("Yaa");
        dayNames4.setMaleName("Yaw");
        dayNames4.setUsers(user);
        dayNamesRepository.save(dayNames4);

        DayNames dayNames5 = new DayNames();
        dayNames5.setDays("Friday");
        dayNames5.setFemaleName("Afua");
        dayNames5.setMaleName("Kofi");
        dayNames5.setUsers(user);
        dayNamesRepository.save(dayNames5);

        DayNames dayNames6 = new DayNames();
        dayNames6.setDays("Saturday");
        dayNames6.setFemaleName("Ama");
        dayNames6.setMaleName("Kwame");
        dayNames6.setUsers(user);
        dayNamesRepository.save(dayNames6);

        DayNames dayNames7 = new DayNames();
        dayNames7.setDays("Sunday");
        dayNames7.setFemaleName("Akosua");
        dayNames7.setMaleName("Kwesi");
        dayNames7.setUsers(user);
        dayNamesRepository.save(dayNames7);
    }

}
