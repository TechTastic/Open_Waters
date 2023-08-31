package io.github.techtastic.open_waters.block.custom

import net.minecraft.core.BlockPos
import net.minecraft.world.level.block.BaseEntityBlock
import net.minecraft.world.level.block.RenderShape
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState

class DraftingTableBlock(properties: Properties) : BaseEntityBlock(properties) {

    override fun newBlockEntity(pos: BlockPos, state: BlockState): BlockEntity? {
        TODO("Not yet implemented")
    }

    override fun getRenderShape(state: BlockState): RenderShape =
            RenderShape.ENTITYBLOCK_ANIMATED
}