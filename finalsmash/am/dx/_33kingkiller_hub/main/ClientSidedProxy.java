package am.dx._33kingkiller_hub.main;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import am.dx._33kingkiller_hub.entity.passive.EntitySmashCube;
import am.dx._33kingkiller_hub.entity.passive.ModelSmashCube;
import am.dx._33kingkiller_hub.entity.passive.RenderSmashCube;

public class ClientSidedProxy extends ServerSidedProxy {

	//Registers proxy stuff for the client side.
	@Override
	public void RegisterRenderer() {
		RenderingRegistry.registerEntityRenderingHandler(EntitySmashCube.class, new RenderSmashCube(new ModelSmashCube(), 0.3F));
	}
	
}
