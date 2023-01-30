package wealthyturtle.uiesingularities;

import java.util.List;

import javax.annotation.Nonnull;

public final class UniversalSingularity {

    public final String name;
    public final List<UniversalSingularityWrapper> singularities;

    public UniversalSingularity(@Nonnull final String name,
            @Nonnull final List<UniversalSingularityWrapper> singularities) {
        this.name = name;
        this.singularities = singularities;
    }
}
