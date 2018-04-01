package gregtech.api.capability;


import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.IFluidTank;
import net.minecraftforge.fluids.capability.IFluidHandler;

import java.util.List;

public interface IMultipleTankHandler extends IFluidHandler, Iterable<IFluidTank> {

    List<IFluidTank> getFluidTanks();

    int getTanks();

    IFluidTank getTankAt(int index);
}
