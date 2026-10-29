.class public final synthetic LJ7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LJ7/i;


# direct methods
.method public synthetic constructor <init>(LJ7/i;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/d;->q:LJ7/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LJ7/d;->q:LJ7/i;

    invoke-static {p0}, LJ7/i;->h(LJ7/i;)LJ7/o;

    move-result-object p0

    return-object p0
.end method
