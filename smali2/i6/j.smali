.class public final synthetic Li6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Li6/k;


# direct methods
.method public synthetic constructor <init>(Li6/k;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/j;->q:Li6/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Li6/j;->q:Li6/k;

    invoke-static {p0}, Li6/k;->a(Li6/k;)Landroid/net/ConnectivityManager;

    move-result-object p0

    return-object p0
.end method
