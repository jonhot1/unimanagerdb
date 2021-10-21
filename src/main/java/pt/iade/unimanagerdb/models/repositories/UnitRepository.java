package pt.iade.unimanagerdb.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.unimanagerdb.models.Unit;
public interface UnitRepository extends CrudRepository<Unit,Integer> {
    Iterable<Unit> findByName(String name);
    Iterable<Unit> findByNameContaining(String name);
    Iterable<Unit> findByCreditsBetween(int min,int max);
    Iterable<Unit> findByNameContainingAndCreditsBetween (String name,int min,int max);
}