package com.nothing.cardwidget.battery;

import M5.a;
import com.nothing.cardwidget.battery.view.BatteryContainerViewKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryStateManager {
    private static final String TAG = "BatteryStateManager";
    public static final BatteryStateManager INSTANCE = new BatteryStateManager();
    private static HashMap<String, Integer> caseBatteryInfo = new HashMap<>();
    private static HashMap<String, BatteryConfig.BatteryState> batteryStateInfo = new HashMap<>();
    private static HashMap<String, a> currentHandleBatteryInfo = new HashMap<>();

    private BatteryStateManager() {
    }

    public final void clearBatteryState(String uniqueId) {
        n.h(uniqueId, "uniqueId");
        batteryStateInfo.remove(uniqueId);
    }

    public final void clearOldCachedBatteryInfo(Set<String> newAddresses) {
        n.h(newAddresses, "newAddresses");
        HashMap<String, a> map = currentHandleBatteryInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, a> entry : map.entrySet()) {
            if (!newAddresses.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(currentHandleBatteryInfo.remove(((Map.Entry) it.next()).getKey()));
        }
        HashMap<String, Integer> map2 = caseBatteryInfo;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
            if (!newAddresses.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add(caseBatteryInfo.remove(((Map.Entry) it2.next()).getKey()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    public final a earProductsOnCombine(a aVar) {
        int iJ;
        List listK;
        int iJ2;
        n.h(aVar, "<this>");
        String strH = aVar.h();
        int iHashCode = strH.hashCode();
        if (iHashCode != -273684744) {
            if (iHashCode != -79410817) {
                if (iHashCode == 1386738378 && strH.equals("NOTHINGX_DEVICE")) {
                    if (!BatteryContainerViewKt.isSingleBattery(aVar)) {
                        if (aVar.j() == -1 && aVar.m() != -1) {
                            iJ = Math.min(aVar.j(), aVar.m());
                            listK = aVar.i();
                        } else if (aVar.j() == -1 || aVar.m() == -1) {
                            iJ = aVar.j();
                            listK = aVar.k();
                        } else {
                            iJ = aVar.m();
                            listK = aVar.n();
                        }
                        return new a(aVar.a(), aVar.h(), aVar.g(), iJ, aVar.b(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, listK, 14336, null);
                    }
                }
            } else if (strH.equals("FASTPAIR_DEVICE") && !BatteryContainerViewKt.isSingleBattery(aVar)) {
                if (aVar.j() == -1 || aVar.m() == -1) {
                    iJ2 = (aVar.j() != -1 || aVar.m() == -1) ? aVar.j() : aVar.m();
                } else {
                    iJ2 = Math.min(aVar.j(), aVar.m());
                }
                return new a(aVar.a(), aVar.h(), aVar.g(), iJ2, aVar.b(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, aVar.i(), 14336, null);
            }
        } else if (strH.equals("AIRPODS")) {
            if (!BatteryContainerViewKt.isSingleBattery(aVar)) {
                if (aVar.j() == -1) {
                    if (aVar.j() == -1) {
                        iJ = aVar.j();
                        listK = aVar.k();
                    } else {
                        iJ = aVar.j();
                        listK = aVar.k();
                    }
                } else if (aVar.j() == -1) {
                    iJ = aVar.j();
                    listK = aVar.k();
                } else {
                    iJ = aVar.j();
                    listK = aVar.k();
                }
                return new a(aVar.a(), aVar.h(), aVar.g(), iJ, aVar.b(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, listK, 14336, null);
            }
        }
        return aVar;
    }

    public final HashMap<String, BatteryConfig.BatteryState> getBatteryStateInfo() {
        return batteryStateInfo;
    }

    public final HashMap<String, Integer> getCaseBatteryInfo() {
        return caseBatteryInfo;
    }

    public final HashMap<String, a> getCurrentHandleBatteryInfo() {
        return currentHandleBatteryInfo;
    }

    public final BatteryConfig.BatteryState initState(a aVar, String uniqueId) {
        n.h(aVar, "<this>");
        n.h(uniqueId, "uniqueId");
        if (aVar.c() != -1) {
            BatteryConfig.BatteryState batteryState = BatteryConfig.BatteryState.INIT_IN_CASE;
            setBatteryState(uniqueId, batteryState);
            return batteryState;
        }
        BatteryConfig.BatteryState batteryState2 = BatteryConfig.BatteryState.NORMAL;
        setBatteryState(uniqueId, batteryState2);
        return batteryState2;
    }

    public final BatteryConfig.BatteryState queryBatteryState(a aVar, String uniqueId) {
        n.h(aVar, "<this>");
        n.h(uniqueId, "uniqueId");
        BatteryConfig.BatteryState batteryState = batteryStateInfo.get(uniqueId);
        return batteryState == null ? INSTANCE.initState(aVar, uniqueId) : batteryState;
    }

    public final void setBatteryState(String uniqueId, BatteryConfig.BatteryState state) {
        n.h(uniqueId, "uniqueId");
        n.h(state, "state");
        batteryStateInfo.put(uniqueId, state);
    }

    public final void setBatteryStateInfo(HashMap<String, BatteryConfig.BatteryState> map) {
        n.h(map, "<set-?>");
        batteryStateInfo = map;
    }

    public final void setCaseBatteryInfo(HashMap<String, Integer> map) {
        n.h(map, "<set-?>");
        caseBatteryInfo = map;
    }

    public final void setCurrentHandleBatteryInfo(HashMap<String, a> map) {
        n.h(map, "<set-?>");
        currentHandleBatteryInfo = map;
    }
}
