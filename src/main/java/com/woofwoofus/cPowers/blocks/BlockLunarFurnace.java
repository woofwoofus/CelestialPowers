package com.woofwoofus.cPowers.blocks;

import com.woofwoofus.cPowers.CelestialPowers;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLunarFurnace extends Block{

	public BlockLunarFurnace() {
		super(Material.iron);
		setCreativeTab(CelestialPowers.tabCelestial);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos,
			IBlockState state, EntityPlayer playerIn, EnumFacing side,
			float hitX, float hitY, float hitZ) {
		return false;
	}
	
	@Override
	public void onBlockClicked(World worldIn, BlockPos pos,
			EntityPlayer playerIn) {

	}
	
	/**
	 * Provides small redstone signal at night
	 */
	@Override 
	public int isProvidingWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
    {
        return 0;
    }
	
}
