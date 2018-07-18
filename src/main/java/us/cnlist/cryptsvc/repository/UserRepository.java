package us.cnlist.cryptsvc.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cryptsvc.domain.SystemUser;

public interface UserRepository extends CrudRepository<SystemUser, Long> {
}
