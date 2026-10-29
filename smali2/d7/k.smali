.class public final synthetic Ld7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Li7/d;

.field public final synthetic r:Le3/Z;

.field public final synthetic s:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Li7/d;Le3/Z;Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/k;->q:Li7/d;

    iput-object p2, p0, Ld7/k;->r:Le3/Z;

    iput-object p3, p0, Ld7/k;->s:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Ld7/k;->q:Li7/d;

    iget-object v1, p0, Ld7/k;->r:Le3/Z;

    iget-object p0, p0, Ld7/k;->s:Landroid/content/Context;

    invoke-static {v0, v1, p0}, Ld7/l;->c(Li7/d;Le3/Z;Landroid/content/Context;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
