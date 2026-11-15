package com.pixel.qualifiervsprimary.service;

import com.pixel.qualifiervsprimary.ContentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialisedService {

    private final ContentStrategy contentStrategy;

    @Autowired
    public SocialisedService(ContentStrategy contentStrategy) {
        this.contentStrategy = contentStrategy;
    }
    public void postContent() {
        contentStrategy.postProcess();
    }
}
