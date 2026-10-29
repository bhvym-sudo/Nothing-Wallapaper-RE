.class public final LR7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/nothing/experience/AppTracking;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/nothing/experience/AppTracking;->getInstance(Landroid/content/Context;)Lcom/nothing/experience/AppTracking;

    move-result-object p1

    iput-object p1, p0, LR7/a;->a:Lcom/nothing/experience/AppTracking;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)Z
    .registers 4

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LR7/a;->a:Lcom/nothing/experience/AppTracking;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/experience/AppTracking;->logProductEvent(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p0

    return p0
.end method
