package tk.genesishub.gFeatures.PluginManage;

public class gDestroyCriticalPlugin {
	PluginState state;
	static double version;
	public gDestroyCriticalPlugin(PluginState state1){
			this.state = state1;
	}
	public gDestroyCriticalPlugin(double version1){
		version = version1;
	}
	public PluginState getState(){
		return this.state;
	}
}
