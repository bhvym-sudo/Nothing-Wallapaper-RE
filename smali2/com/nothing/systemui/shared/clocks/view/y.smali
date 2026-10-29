.class public final synthetic Lcom/nothing/systemui/shared/clocks/view/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/systemui/shared/clocks/view/D;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/systemui/shared/clocks/view/D;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/y;->q:Lcom/nothing/systemui/shared/clocks/view/D;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/y;->q:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->c(Lcom/nothing/systemui/shared/clocks/view/D;)V

    return-void
.end method
