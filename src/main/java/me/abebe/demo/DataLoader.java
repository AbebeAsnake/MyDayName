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
@Autowired
ZodiacRepository zodiacRepository;

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




        // add zodiac
        Zodiac zo = new Zodiac();
        zo.setName("The Year of the Tiger");
        zo.setYearStart(1914);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/2015-tiger.jpg");
        zo.setLuckyColors("blue, grey, orange, white ");
        zo.setLuckyFlowers("yellow lily, cineraria ");
        zo.setLuckyNumbers("1, 3, 4 ");
        zodiacRepository.save(zo);


        zo = new Zodiac();
        zo.setName("The Year of the Ox ");
        zo.setYearStart(1913);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/ox-year.jpg");
        zo.setLuckyColors("white, yellow, green ");
        zo.setLuckyFlowers(" tulip, morning glory, peach blossom  ");
        zo.setLuckyNumbers(" 1, 4  ");
        zodiacRepository.save(zo);

        zo = new Zodiac();
        zo.setName("The Year of the Rat ");
        zo.setYearStart(1924);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/rat-2015.jpg");
        zo.setLuckyColors("blue, gold, green ");
        zo.setLuckyFlowers(" lily, African violet  ");
        zo.setLuckyNumbers(" 2 , 3 ");
        zodiacRepository.save(zo);

        zo = new Zodiac();
        zo.setName("The Year of the Rabbit  ");
        zo.setYearStart(1939);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/rabbit-2015.jpg");
        zo.setLuckyColors(" red, pink, purple, blue  ");
        zo.setLuckyFlowers(" plantain lily and jasmine  ");
        zo.setLuckyNumbers(" 3,4,6 ");
        zodiacRepository.save(zo);


        zo = new Zodiac();
        zo.setName("The Year of the Dragon ");
        zo.setYearStart(1928);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/dragon-2015.jpg");
        zo.setLuckyColors(" gold, silver, grayish white  ");
        zo.setLuckyFlowers(" bleeding-heart glory bower, dragon flowers   ");
        zo.setLuckyNumbers(" 1,6,7");
        zodiacRepository.save(zo);

        zo = new Zodiac();
        zo.setName("The Year of the Snake ");
        zo.setYearStart(1917);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/year-snake.jpg");
        zo.setLuckyColors(" black, red, and yellow  ");
        zo.setLuckyFlowers(" orchid and cactus   ");
        zo.setLuckyNumbers(" 2,8,9");
        zodiacRepository.save(zo);


        zo = new Zodiac();
        zo.setName("The Year of the Horse");
        zo.setYearStart(1930);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/horse-2015.jpg");
        zo.setLuckyColors("  yellow and green  ");
        zo.setLuckyFlowers(" calla lily and jasmine    ");
        zo.setLuckyNumbers(" 2, 3, 7, and numbers containing them (like 23 and 37)");
        zodiacRepository.save(zo);

        zo = new Zodiac();
        zo.setName("The Year of the Goat");
        zo.setYearStart(1931);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/goat-year.jpg");
        zo.setLuckyColors("  green, red, purple   ");
        zo.setLuckyFlowers(" carnation, primrose   ");
        zo.setLuckyNumbers(" 2,7");
        zodiacRepository.save(zo);


        zo = new Zodiac();
        zo.setName("TYear of the Monkey");
        zo.setYearStart(1932);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/year-monkey.jpg");
        zo.setLuckyColors("  white, blue, gold    ");
        zo.setLuckyFlowers(" chrysanthemum, crape-myrtle   ");
        zo.setLuckyNumbers("4,9");
        zodiacRepository.save(zo);

        zo = new Zodiac();
        zo.setName("The Year of the Rooster ");
        zo.setYearStart(1933);
        zo.setImage("https://images.chinahighlights.com/allpicture/2015/04/f9463344d3ed41479d28dcd7.jpg");
        zo.setLuckyColors("  gold, brown, and yellow");
        zo.setLuckyFlowers(" cgladiola, cockscomb     ");
        zo.setLuckyNumbers("5,7,8");
        zodiacRepository.save(zo);



        zo = new Zodiac();
        zo.setName("The Year of the Dog");
        zo.setYearStart(1934);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/dog-2015.jpg");
        zo.setLuckyColors("  red, green, and purple");
        zo.setLuckyFlowers(" rose, cymbidium orchids");
        zo.setLuckyNumbers("3,4,9");
        zodiacRepository.save(zo);

        zo = new Zodiac();
        zo.setName("The Year of the Pig");
        zo.setYearStart(1935);
        zo.setImage("https://data.chinahighlights.com/image/travelguide/culture/zodiac/pig-2015.jpg");
        zo.setLuckyColors("  yellow, gray, brown, gold");
        zo.setLuckyFlowers(" hydrangea and daisy ");
        zo.setLuckyNumbers(" 2, 5, 8, and numbers containing them (like 25 and 58) ");
        zodiacRepository.save(zo);


    }

}
