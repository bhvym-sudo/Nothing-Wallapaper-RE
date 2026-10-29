package p072h1;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;
import p089i8.N;
import p089i8.U;
import p142o1.g;
import p189s8.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private static final Map a(g gVar, String str) throws IOException {
        Cursor cursorF0 = gVar.f0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorF0.getColumnCount() <= 0) {
                Map mapG = N.g();
                b.a(cursorF0, null);
                return mapG;
            }
            int columnIndex = cursorF0.getColumnIndex("name");
            int columnIndex2 = cursorF0.getColumnIndex("type");
            int columnIndex3 = cursorF0.getColumnIndex("notnull");
            int columnIndex4 = cursorF0.getColumnIndex("pk");
            int columnIndex5 = cursorF0.getColumnIndex("dflt_value");
            Map mapC = N.c();
            while (cursorF0.moveToNext()) {
                String name = cursorF0.getString(columnIndex);
                String type = cursorF0.getString(columnIndex2);
                boolean z9 = cursorF0.getInt(columnIndex3) != 0;
                int i10 = cursorF0.getInt(columnIndex4);
                String string = cursorF0.getString(columnIndex5);
                n.g(name, "name");
                n.g(type, "type");
                mapC.put(name, new d.a(name, type, z9, i10, string, 2));
            }
            Map mapB = N.b(mapC);
            b.a(cursorF0, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(cursorF0, th);
                throw th2;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TypedValues.TransitionType.S_FROM);
        int columnIndex4 = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        List listC = AbstractC1444s.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            n.g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            n.g(string2, "cursor.getString(toColumnIndex)");
            listC.add(new d.C0545d(i10, i11, string, string2));
        }
        return AbstractC1444s.l0(AbstractC1444s.a(listC));
    }

    private static final Set c(g gVar, String str) throws IOException {
        Cursor cursorF0 = gVar.f0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorF0.getColumnIndex("id");
            int columnIndex2 = cursorF0.getColumnIndex("seq");
            int columnIndex3 = cursorF0.getColumnIndex("table");
            int columnIndex4 = cursorF0.getColumnIndex("on_delete");
            int columnIndex5 = cursorF0.getColumnIndex("on_update");
            List listB = b(cursorF0);
            cursorF0.moveToPosition(-1);
            Set setB = U.b();
            while (cursorF0.moveToNext()) {
                if (cursorF0.getInt(columnIndex2) == 0) {
                    int i10 = cursorF0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<d.C0545d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((d.C0545d) obj).f() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (d.C0545d c0545d : arrayList3) {
                        arrayList.add(c0545d.e());
                        arrayList2.add(c0545d.g());
                    }
                    String string = cursorF0.getString(columnIndex3);
                    n.g(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorF0.getString(columnIndex4);
                    n.g(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorF0.getString(columnIndex5);
                    n.g(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = U.a(setB);
            b.a(cursorF0, null);
            return setA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(cursorF0, th);
                throw th2;
            }
        }
    }

    private static final d.e d(g gVar, String str, boolean z9) throws IOException {
        Cursor cursorF0 = gVar.f0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorF0.getColumnIndex("seqno");
            int columnIndex2 = cursorF0.getColumnIndex("cid");
            int columnIndex3 = cursorF0.getColumnIndex("name");
            int columnIndex4 = cursorF0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorF0.moveToNext()) {
                    if (cursorF0.getInt(columnIndex2) >= 0) {
                        int i10 = cursorF0.getInt(columnIndex);
                        String columnName = cursorF0.getString(columnIndex3);
                        String str2 = cursorF0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        n.g(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                n.g(collectionValues, "columnsMap.values");
                List listR0 = AbstractC1444s.r0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                n.g(collectionValues2, "ordersMap.values");
                d.e eVar = new d.e(str, z9, listR0, AbstractC1444s.r0(collectionValues2));
                b.a(cursorF0, null);
                return eVar;
            }
            b.a(cursorF0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(cursorF0, th);
                throw th2;
            }
        }
    }

    private static final Set e(g gVar, String str) throws IOException {
        Cursor cursorF0 = gVar.f0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorF0.getColumnIndex("name");
            int columnIndex2 = cursorF0.getColumnIndex("origin");
            int columnIndex3 = cursorF0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = U.b();
                while (cursorF0.moveToNext()) {
                    if (n.d("c", cursorF0.getString(columnIndex2))) {
                        String name = cursorF0.getString(columnIndex);
                        boolean z9 = true;
                        if (cursorF0.getInt(columnIndex3) != 1) {
                            z9 = false;
                        }
                        n.g(name, "name");
                        d.e eVarD = d(gVar, name, z9);
                        if (eVarD == null) {
                            b.a(cursorF0, null);
                            return null;
                        }
                        setB.add(eVarD);
                    }
                }
                Set setA = U.a(setB);
                b.a(cursorF0, null);
                return setA;
            }
            b.a(cursorF0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(cursorF0, th);
                throw th2;
            }
        }
    }

    public static final d f(g database, String tableName) {
        n.h(database, "database");
        n.h(tableName, "tableName");
        return new d(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
