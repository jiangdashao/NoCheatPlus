package fr.neatmonster.nocheatplus.components.entity;

import java.util.List;

import org.bukkit.entity.Entity;

/**
 * Vehicle specific access to entities.
 * 
 * @author asofold
 *
 */
public interface IEntityAccessVehicle {

    /**
     * Get the current passengers for a vehicle (entity).
     * 
     * @param entity
     * @return
     */
    public List<Entity> getEntityPassengers(Entity entity);

    /**
     * Add a new passenger (entity) to the given vehicle.
     * 
     * @param entity
     * @param vehicle
     * @return
     */
    public boolean addPassenger(Entity entity, Entity vehicle);

}
