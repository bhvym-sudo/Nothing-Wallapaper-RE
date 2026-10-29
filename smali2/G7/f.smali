.class public final synthetic LG7/f;
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

    iput-object p1, p0, LG7/f;->q:LJ7/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LG7/f;->q:LJ7/i;

    invoke-static {p0}, LG7/d$e$a;->a(LJ7/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
