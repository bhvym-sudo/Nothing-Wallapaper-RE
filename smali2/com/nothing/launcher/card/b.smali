.class public final synthetic Lcom/nothing/launcher/card/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lv8/a;


# direct methods
.method public synthetic constructor <init>(Lv8/a;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/b;->q:Lv8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/b;->q:Lv8/a;

    invoke-static {p0}, Lcom/nothing/launcher/card/h;->f(Lv8/a;)V

    return-void
.end method
