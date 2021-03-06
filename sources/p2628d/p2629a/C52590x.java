package p2628d.p2629a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p2628d.p2639f.p2641b.C52706f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.x */
public final class C52590x implements C52695a, Serializable, List, RandomAccess {
    public static final C52590x INSTANCE = new C52590x();
    private static final long serialVersionUID = -7390468764508069838L;

    private C52590x() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void add(int i, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Void voidR) {
        C52711k.m112240b(voidR, "element");
        return false;
    }

    public final int getSize() {
        return 0;
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Void voidR) {
        C52711k.m112240b(voidR, "element");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int lastIndexOf(Void voidR) {
        C52711k.m112240b(voidR, "element");
        return -1;
    }

    public final Void remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Void set(int i, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return C52706f.m112226a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C52706f.m112227a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    public final Iterator iterator() {
        return C52589w.f130882a;
    }

    public final ListIterator listIterator() {
        return C52589w.f130882a;
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return contains((Void) obj);
    }

    public final boolean containsAll(Collection collection) {
        C52711k.m112240b(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return indexOf((Void) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return lastIndexOf((Void) obj);
    }

    public final Void get(int i) {
        StringBuilder sb = new StringBuilder("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C52589w.f130882a;
        }
        StringBuilder sb = new StringBuilder("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
