package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteArrayTemplate extends AbstractTemplate<byte[]> {
    static final ByteArrayTemplate instance = new ByteArrayTemplate();

    private ByteArrayTemplate() {
    }

    public static ByteArrayTemplate getInstance() {
        return instance;
    }

    public byte[] read(Unpacker unpacker, byte[] bArr, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return unpacker.readByteArray();
        }
        return null;
    }

    public void write(Packer packer, byte[] bArr, boolean z) throws IOException {
        if (bArr != null) {
            packer.write(bArr);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new C53798c("Attempted to write null");
        }
    }
}
