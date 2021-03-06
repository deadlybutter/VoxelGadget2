package com.thevoxelbox.voxelgadget.modifier;

import com.thevoxelbox.voxelgadget.Processor;
import org.bukkit.block.Block;

public class BlockPlaceMode extends AbstractModeModifier {

	@Override
	public int modify(Processor p, Block nextBlock) {
		if (p.getDispensed().getTypeId() == 387) {
			(new BlueprintModifier()).paste(p);
			return 0;
		}
		Block existing = p.getDispenser().getRelative(p.getTrain().getOppositeFace(), p.getOffset());
		if (p.getOffset3D() != null) existing = p.getOffset3D().getBlock();
		if (p.getOverride() == null) setBlock(existing, p.getDispensed().getTypeId(), (byte) p.getDispensed().getData().getData(), p.applyPhysics(), p);
		else setBlock(existing, p.getOverride().getTypeId(), (byte) p.getOverride().getData(), p.applyPhysics(), p);
		return 0;
	}

}
