package tk.genesishub.gFeatures.Listeners;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;



import tk.genesishub.gFeatures.Commands.gFeatureCore;
import tk.genesishub.gFeatures.Commands.gWarsSuiteCore;
/*
gFeatures
https://github.com/Seshpenguin/gFeatures

   Copyright 2015 DolphinBox

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

public class CommandCentral {

	gFeatureCore gfc  = new gFeatureCore();
	gWarsSuiteCore gwc = new gWarsSuiteCore();
	public void CommandInitiate(final CommandSender sender, Command cmd, String label, String[] args) throws NumberFormatException, Exception{
		gfc.CommandSwitch(sender, cmd, label, args);
		gwc.CommandSwitch(sender, cmd, label, args);
		//gFeatureCore
		
	}
}
