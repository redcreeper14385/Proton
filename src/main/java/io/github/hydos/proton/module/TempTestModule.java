package io.github.hydos.proton.module;

import io.github.hydos.proton.Proton;
import net.minecraft.util.Identifier;

public class TempTestModule extends Module {
    public TempTestModule() {
        super(new Identifier("temp", "tempid"));
    }

    @Override
    public void clientInit() {
        Proton.LOGGER.info("Hello from Test Module client init!");
    }

    @Override
    public void serverInit() {
        Proton.LOGGER.info("Hello from Test Module server init!");
    }

    @Override
    public void commonInit() {
        Proton.LOGGER.info("Hello from Test Module common init!");
    }
}
