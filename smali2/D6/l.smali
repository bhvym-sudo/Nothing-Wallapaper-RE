.class public final synthetic LD6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LD6/p;


# direct methods
.method public synthetic constructor <init>(LD6/p;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/l;->q:LD6/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LD6/l;->q:LD6/p;

    invoke-static {p0}, LD6/p;->a(LD6/p;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method
