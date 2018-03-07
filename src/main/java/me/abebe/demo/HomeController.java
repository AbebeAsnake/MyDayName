package me.abebe.demo;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Controller
public class HomeController {
    @Autowired
    DayNamesRepository dayNamesRepository;

    @Autowired
    ZodiacRepository zodiacRepository;
    @RequestMapping("/")
    public String index(Model model){
        return "prompt";
    }
    @RequestMapping("/search")
    public String displayName(HttpServletRequest request,Model model) throws ParseException {
       /* LocalDate userDate=null;
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);*/
        String dates = request.getParameter("dateentered");
        String male = request.getParameter("male");
        String female = request.getParameter("female");
        model.addAttribute("females", female);
        model.addAttribute("males", male);
        //DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        //DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        //userDate = LocalDate.parse(dates,dTF);
        //DateFormat format2=new SimpleDateFormat("EEEE");
        //String finalDay=format2.format(userDate);
        // System.out.println(finalDay);
        //System.out.println(male);
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date MyDate = newDateFormat.parse(dates);
        //newDateFormat.applyPattern("EEEE d MMM yyyy");
        newDateFormat.applyPattern("EEEE");
        String MyDates = newDateFormat.format(MyDate);

        newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date MyYear = newDateFormat.parse(dates);
        newDateFormat.applyPattern("yyyy");
        String MyYears = newDateFormat.format(MyYear);
        long myyears = Long.parseLong(MyYears);
        System.out.println(MyDates);
        System.out.println(MyYears);
        model.addAttribute("days", dayNamesRepository.findByDays(MyDates));


        Iterable<Zodiac> zoIt = zodiacRepository.findAll();

       for (Zodiac zos : zoIt)
       {
           long id = zos.getId();

       long yearC =zos.getYearStart();
       System.out.println(zodiacRepository.findById(id));
       while ( yearC!= myyears || yearC < myyears)
       {
             yearC =yearC + 12;

          }

           if( yearC == myyears)
           {
               long ids = zos.getId();

               model.addAttribute("foundzod", zodiacRepository.findById(ids));
           }
           if(yearC>myyears) {
           break;
           }
       }


            //Iterable<DayNames> days = dayNamesRepository.findByDays(MyDates);
        /*LocalDate dt = new LocalDate();
        dt.getDayOfWeek();*/
            //DayOfWeek dayOfWeek = dateHistory.getUserDate().getDayOfWeek();
            //DayNames dayNames = new DayNames();
//        if(female.equalsIgnoreCase("female") && male.equalsIgnoreCase("male")){}
            return "showweek";
    }
    @RequestMapping("/horoscope")
    public String horoscopes(HttpServletRequest request, Model model) {
        String s = request.getParameter("dateentered");
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://horoscope-api.herokuapp.com/horoscope/today" + s;
        System.out.println(url);
       // Horoscope horoscope = restTemplate.getForObject(url, Horoscope.class);

        System.out.println(s);
     //String xx = horoscope.getValue().getHoroscope();

        return "showweek";
    }
@RequestMapping("/know")
    public @ResponseBody String knows(){

    RestTemplate restTemplate = new RestTemplate();
    String url = "http://horoscope-api.herokuapp.com/knowmore/libra" ;
    System.out.println(url);
    Horoscope horoscope = restTemplate.getForObject(url, Horoscope.class);
    return  horoscope.getValue().getSunsign();

}

}
