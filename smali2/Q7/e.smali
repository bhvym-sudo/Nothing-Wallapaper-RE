.class public final synthetic LQ7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    invoke-static {}, LQ7/f;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    return-object p0
.end method
