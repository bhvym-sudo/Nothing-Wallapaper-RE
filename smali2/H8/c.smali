.class public final synthetic LH8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:Lv8/l;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lv8/l;Ljava/lang/Object;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/c;->q:Lv8/l;

    iput-object p2, p0, LH8/c;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, LH8/c;->q:Lv8/l;

    iget-object p0, p0, LH8/c;->r:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lm8/i;

    invoke-static {v0, p0, p1, p2, p3}, LH8/e;->i(Lv8/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
