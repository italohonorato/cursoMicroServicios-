package cl.teamweichafe.services.impl;

import cl.teamweichafe.domain.MemberMeasure;
import cl.teamweichafe.repository.MemberMeasureRepository;
import cl.teamweichafe.services.MemberMeasureService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberMeasureServiceImpl implements MemberMeasureService {

    private final MemberMeasureRepository measureRepository;

    public MemberMeasureServiceImpl(MemberMeasureRepository measureRepository) {
        this.measureRepository = measureRepository;
    }

    @Override
    public MongoRepository<MemberMeasure, String> getRepository() {
        return this.measureRepository;
    }
}
