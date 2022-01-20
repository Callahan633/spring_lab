package com.morozov.spring.controllers;

import com.morozov.spring.model.Address;
import com.morozov.spring.model.Area;
import com.morozov.spring.model.Education;
import com.morozov.spring.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FormsController {
    private final AddressRepository addressRepository;
    private final AreaRepository areaRepository;
    private final ChildRepository childRepository;
    private final EducationRepository educationRepository;
    private final ParentsRepository parentsRepository;

    @RequestMapping("/mock-data")
    public String makeData(Model model) {
        mockData();
        return "main";
    }

    public void mockData() {
        Area[] areas = new Area[]{
                new Area(),
                new Area(),
                new Area(),
        };
        for (Area area : areas) {
            this.areaRepository.save(area);
        }

        int i = 0;
        List<Address> addresses = new ArrayList<>(25);
        for (String addressName : new String[]{
            "1 Street",
            "2 Street",
            "3 Street",
            "4 Street",
            "5 Street",
            "6 Street",
            "7 Street",
            "8 Street",
            "9 Street",
            "10 Street",
            "11 Street",
            "12 Street",
            "13 Street",
            "14 Street",
            "15 Street",
            "16 Street",
            "17 Street",
            "18 Street",
            "19 Street",
            "20 Street",
            "21 Street",
            "22 Street",
            "23 Street",
            "24 Street",
            "25 Street",
        }) {
            Address address = new Address(addressName, areas[i % 3]);
            this.addressRepository.save(address);
            addresses.add(address);
            i++;
        }

        for (i = 0; i < 6; i++) {
            Education education = new Education(i, addresses.get(i));
            this.educationRepository.save(education);
        }
    }

    public void addParent() {

    }

    public void addChild() {

    }
}
