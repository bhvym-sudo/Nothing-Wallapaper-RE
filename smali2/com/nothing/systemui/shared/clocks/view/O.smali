.class public final synthetic Lcom/nothing/systemui/shared/clocks/view/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/O;->q:Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/O;->q:Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->J(Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;)V

    return-void
.end method
