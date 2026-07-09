package com.cognizant;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private List<Country> countryList;

    public CountryService() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        countryList =
                context.getBean("countryList", List.class);
    }

    public List<Country> getAllCountries() {

        return countryList;
    }

    public Country getCountry(String code)
            throws CountryNotFoundException {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {

                return country;
            }
        }

        throw new CountryNotFoundException();
    }
}