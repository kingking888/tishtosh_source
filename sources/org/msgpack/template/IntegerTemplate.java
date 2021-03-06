package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class IntegerTemplate extends AbstractTemplate<Integer> {
    static final IntegerTemplate instance = new IntegerTemplate();

    private IntegerTemplate() {
    }

    public static IntegerTemplate getInstance() {
        return instance;
    }

    public Integer read(Unpacker unpacker, Integer num, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Integer.valueOf(unpacker.readInt());
        }
        return null;
    }

    public void write(Packer packer, Integer num, boolean z) throws IOException {
        if (num != null) {
            packer.write(num.intValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new C53798c("Attempted to write null");
        }
    }
}
