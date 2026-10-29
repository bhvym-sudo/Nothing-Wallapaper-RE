.class public final synthetic Lcom/nothing/systemui/shared/clocks/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, LK2/b;

    invoke-static {p1}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->J(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
