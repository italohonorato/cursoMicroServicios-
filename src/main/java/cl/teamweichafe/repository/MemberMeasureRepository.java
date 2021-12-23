package cl.teamweichafe.repository;

import cl.teamweichafe.domain.MemberMeasure;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMeasureRepository extends MongoRepository<MemberMeasure, String> {
}
