.class public final synthetic LO8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:LO8/i;


# direct methods
.method public synthetic constructor <init>(LO8/i;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO8/h;->q:LO8/i;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, LO8/h;->q:LO8/i;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lh8/A;

    check-cast p3, Lm8/i;

    invoke-static {p0, p1, p2, p3}, LO8/i;->d(LO8/i;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
