.class public final synthetic LK5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/battery/timer/HandleTimer;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/battery/timer/HandleTimer;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK5/c;->q:Lcom/nothing/cardwidget/battery/timer/HandleTimer;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LK5/c;->q:Lcom/nothing/cardwidget/battery/timer/HandleTimer;

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->a(Lcom/nothing/cardwidget/battery/timer/HandleTimer;)V

    return-void
.end method
