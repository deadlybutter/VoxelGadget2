
package com.thevoxelbox.voxelgadget.modifier;

import com.thevoxelbox.voxelgadget.Processor;
import org.bukkit.block.Block;


public class InvertCheckModifier extends AbstractModifier{

	@Override
	public int modify(Processor p, Block nextBlock) {
		p.setCheck(!p.getCheck());
		return 0;
	}

}
