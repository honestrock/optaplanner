/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.phase;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.impl.phase.event.PhaseLifecycleListener;
import org.optaplanner.core.impl.solver.scope.DefaultSolverScope;

/**
 * A phase of a {@link Solver}.
 * @see AbstractPhase
 */
public interface Phase extends PhaseLifecycleListener {

    void solve(DefaultSolverScope solverScope);

    void addPhaseLifecycleListener(PhaseLifecycleListener phaseLifecycleListener);

    void removePhaseLifecycleListener(PhaseLifecycleListener phaseLifecycleListener);

}
