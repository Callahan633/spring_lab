package com.morozov.spring.services;

import com.morozov.spring.model.Address;
import com.morozov.spring.model.Area;
import com.morozov.spring.model.Education;
import com.morozov.spring.repositories.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class FormsService {
    private final AddressRepository addressRepository;
    private final AreaRepository areaRepository;
    private final ChildRepository childRepository;
    private final EducationRepository educationRepository;
    private final ParentsRepository parentsRepository;

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
            addresses.add(address);
            this.addressRepository.save(address);
            i++;
        }

        for (i = 0; i < 6; i++) {
            Education education = new Education(i, addresses.get(i));
            this.educationRepository.save(education);
        }
    }
}
