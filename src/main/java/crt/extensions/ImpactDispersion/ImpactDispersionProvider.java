package crt.extensions.ImpactDispersion;

import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtensionProvider;

@Plugin
public class ImpactDispersionProvider extends AbstractSimulationExtensionProvider
{
    public ImpactDispersionProvider() {
        super(ImpactDispersionExtension.class, new String[] { "Capital Rocket Team", "Impact dispersion" });
    }
}
