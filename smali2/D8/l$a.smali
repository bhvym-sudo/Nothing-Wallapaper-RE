.class public final LD8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/l;->b(Lv8/p;)LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv8/p;


# direct methods
.method public constructor <init>(Lv8/p;)V
    .registers 2

    iput-object p1, p0, LD8/l$a;->a:Lv8/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 1

    iget-object p0, p0, LD8/l$a;->a:Lv8/p;

    invoke-static {p0}, LD8/l;->a(Lv8/p;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method
