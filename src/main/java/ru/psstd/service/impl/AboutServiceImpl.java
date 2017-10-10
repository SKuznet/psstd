package ru.psstd.service.impl;

import org.springframework.stereotype.Service;
import ru.psstd.model.About;
import ru.psstd.service.AboutService;

@Service("aboutService")
public class AboutServiceImpl implements AboutService {
    @Override
    public About getInfo() {
        //mock
        About about = new About();
        about.setInn("1111111111");
        about.setAddress("SPb");
        about.setKpp("kpp");
        about.setPhone("+7-999-00-00");
        return about;
    }
}
