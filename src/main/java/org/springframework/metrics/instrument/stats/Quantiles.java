package org.springframework.metrics.instrument.stats;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Calculate φ-quantiles, where 0 ≤ φ ≤ 1. The φ-quantile is the observation value that ranks at number φ*N among
 * N observations. Examples for φ-quantiles: The 0.5-quantile is known as the median. The 0.95-quantile is the
 * 95th percentile.
 *
 * @author Jon Schneider
 */
public interface Quantiles {
    /**
     * Add a sample
     * @param value
     */
    void observe(double value);
    
    /**
     * @param percentile (0 .. 1.0)
     * @return Get the Nth percentile
     */
    Double get(double percentile);

    /**
     * Get all registered quantiles
     */
    Collection<Double> registered();
}