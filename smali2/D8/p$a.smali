.class public final LD8/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/p;->e(Ljava/util/Iterator;)LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .registers 2

    iput-object p1, p0, LD8/p$a;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 1

    iget-object p0, p0, LD8/p$a;->a:Ljava/util/Iterator;

    return-object p0
.end method
