package com.pixel.qualifiervsprimary.service;

import com.pixel.qualifiervsprimary.ContentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SocialisedServiceYT {

    private final ContentStrategy contentStrategy;

    @Autowired
    public SocialisedServiceYT(@Qualifier("videoContentStrategy") ContentStrategy contentStrategy) {
        this.contentStrategy = contentStrategy;
    }
    public void postContent() {
        contentStrategy.postProcess();
    }
}
