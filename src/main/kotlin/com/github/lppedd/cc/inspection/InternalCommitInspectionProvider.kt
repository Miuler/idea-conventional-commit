package com.github.lppedd.cc.inspection

import com.github.lppedd.cc.api.CommitInspectionProvider

/**
 * @author Edoardo Luppi
 */
private class InternalCommitInspectionProvider : CommitInspectionProvider {
  override fun getInspections(): Collection<CommitBaseInspection> =
    listOf(
        CommitFormatInspection(),
        CommitNamingConventionInspection(),
    )
}
