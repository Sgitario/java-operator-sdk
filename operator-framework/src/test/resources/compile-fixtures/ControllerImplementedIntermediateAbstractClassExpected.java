package io;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;

public class MyCustomResourceDoneable extends CustomResourceDoneable<AbstractController.MyCustomResource> {
    @SuppressWarnings("unchecked")
    public MyCustomResourceDoneable(AbstractController.MyCustomResource resource, Function function) {
        super(resource, function);
    }
}
