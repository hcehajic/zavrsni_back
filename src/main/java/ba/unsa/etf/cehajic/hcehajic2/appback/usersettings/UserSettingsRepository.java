package ba.unsa.etf.cehajic.hcehajic2.appback.usersettings;

import ba.unsa.etf.cehajic.hcehajic2.appback.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long>{
}