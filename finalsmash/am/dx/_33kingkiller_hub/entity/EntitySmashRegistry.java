package am.dx._33kingkiller_hub.entity;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import am.dx._33kingkiller_hub.entity.passive.EntitySmashCube;
import am.dx._33kingkiller_hub.main.Smash;

public class EntitySmashRegistry {

	//Referred to by the Smash.java.
	public static void EntityRegistry() {
		RegisterEntity();
	}
	
	//Registers entities to eggs.
	public static void RegisterEntity() {
		CreateEntity(EntitySmashCube.class, "SmashCube", 0x4800FF, 0xFFB600);
	}
	//Creates/tracks entities.
	@SuppressWarnings("unchecked")
	public static void CreateEntity(@SuppressWarnings("rawtypes") Class entityClass, String entityName, int solidColour, int spotColour) {
		int entityID = 27;
		
		EntityRegistry.registerModEntity(entityClass, entityName, entityID, Smash.modInstance, 64, 1, true);
		
		CreateEgg(entityID, solidColour, spotColour);
	}
	
	//Creates entity eggs.
	@SuppressWarnings("unchecked")
	public static void CreateEgg(int randomID, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColour, spotColour));
	}
	
}
